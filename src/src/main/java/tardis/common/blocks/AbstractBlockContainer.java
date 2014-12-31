package tardis.common.blocks;

import tardis.api.IActivatable;
import tardis.api.IScrewable;
import tardis.api.IWatching;
import tardis.common.core.Helper;
import tardis.common.items.SonicScrewdriverItem;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class AbstractBlockContainer extends AbstractBlock implements ITileEntityProvider
{
	
	public AbstractBlockContainer()
	{
		super();
		this.isBlockContainer = true;
	}
	
	public AbstractBlockContainer(boolean b)
	{
		super(b);
		this.isBlockContainer = true;
	}

	@Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6)
    {
        super.breakBlock(par1World, par2, par3, par4, par5, par6);
        par1World.removeTileEntity(par2, par3, par4);
    }
    
    @Override
    public boolean onBlockEventReceived(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.onBlockEventReceived(par1World, par2, par3, par4, par5, par6);
        TileEntity tileentity = par1World.getTileEntity(par2, par3, par4);
        return tileentity != null ? tileentity.receiveClientEvent(par5, par6) : false;
    }
    
    @Override
    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer pl, int s, float i, float j, float k)
    {
    	boolean answer = false;
    	TileEntity te = w.getTileEntity(x, y, z);
    	if(te != null && te instanceof IScrewable)
    	{
			ItemStack held = pl.getHeldItem();
			if(held != null)
			{
				Item heldBase = held.getItem();
				if(heldBase instanceof SonicScrewdriverItem && !w.isRemote)
					answer = answer || ((IScrewable)te).screw(SonicScrewdriverItem.getMode(held), pl);
				else if(heldBase instanceof SonicScrewdriverItem && w.isRemote)
					answer = true;
			}
			if(answer)
				Helper.playSound(Helper.getWorldID(w), x,y,z, "tardismod:sonic", 0.5F);
    	}
    	if(te != null && te instanceof IActivatable)
    	{
    		if(w.isRemote)
    			answer = true;
    		else
    			answer = answer || ((IActivatable)te).activate(pl,s);
    	}
        return answer;
    }
    
    @Override
    public void onNeighborBlockChange(World w, int x, int y, int z, Block neighbourBlockID)
	{
		TileEntity te = w.getTileEntity(x, y, z);
		if(te != null && te instanceof IWatching)
		{
			((IWatching)te).neighbourUpdated(neighbourBlockID);
		}
	}

}