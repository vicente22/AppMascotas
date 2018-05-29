package cl.vicentepc.miappprueba1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    /*Se encarga de poner el elemento*/
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return DescriptionFragment.newInstance(0);
            case 1:
                return DataFragment.newInstance(1);
            case 2:
                return PersonalityFragment.newInstance(2);
            default:
                return DescriptionFragment.newInstance(0);
        }

    }

    @Override
    public int getCount() {

        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "DESCRIPCIÓN";
            case 1:
                return "DATOS";
            case 2:
                return "PERSONALIDAD";
        }
        return null;
    }
}
