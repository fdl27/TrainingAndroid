package id.fdl.learnandroid.tabhost;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter extends FragmentStateAdapter{

    private final int COUNT = 3;
    private String tabTitles[] = new String[]{"Tab 1", "Tab 2", "Tab 3"};

    public SampleFragmentPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return Day4TabHostFragmentContent.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return COUNT;
    }


}
