package tardis.common.blocks;

import tardis.TardisMod;
import tardis.common.tileents.TardisTileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TardisBlock extends TardisAbstractBlockContainer
{
	
	//INIT THINGS
	public TardisBlock(int par1)
	{
		super(par1);
	}

	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TardisTileEntity();
	}

	@Override
	public void initData()
	{
		setUnlocalizedName("Tardis");		
	}

	@Override
	public void initRecipes()
	{
		
	}
	
	//OTHER THINGS
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l)
    {
    	super.onBlockActivated(world, x, y, z, player, i, j, k, l);
    	int myMeta = world.getBlockMetadata(x, y, z);
    	if((myMeta == 0 && i == 2) || (myMeta == 1 && i == 5) || (myMeta == 2 && i == 3) || (myMeta == 3 && i == 4))
    	{
    		TileEntity te = world.getBlockTileEntity(x, y, z);
    		if(te instanceof TardisTileEntity)
    		{
    			TardisTileEntity tte = (TardisTileEntity) te;
    			tte.doorActivated(world,x,y,z,player);
    			return true;
    		}
    	}
        return false;
    }

	
	//PLACING AND DESTROYING THINGS
	
	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
		if(world.isAirBlock(x, y, z) && world.isAirBlock(x,y+1,z))
			return true;
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
		if (entity == null)
		{
			return;
		}
	
		int dir = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, dir, 3);
		world.setBlock(x, y+1, z, TardisMod.tardisTopBlock.blockID, dir, 3);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
	{
		super.onBlockDestroyedByPlayer(world, x, y, z, meta);
		if(world.getBlockId(x, y+1,z) == TardisMod.tardisTopBlock.blockID)
			world.setBlockToAir(x, y+1, z);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
	   return false;
	}

}