package com.withings.webradio.ui.coverflow;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
import androidx.viewpager.widget.ViewPager;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.ui.WebRadioSingleViewFragment;
import java.util.List;
/* loaded from: classes4.dex */
public class CoverFlowAdapter extends i0 implements ViewPager.h {
    private static final float ALPHA_SMALL_ITEM = 0.5f;

    /* renamed from: fm  reason: collision with root package name */
    private FragmentManager f46847fm;
    private CoverFlowAdapterListener listener;
    private ViewPager viewPager;
    private List<WebRadio> webRadios;

    /* loaded from: classes4.dex */
    public interface CoverFlowAdapterListener {
        void onCoverScrolled(int i11);
    }

    public CoverFlowAdapter(FragmentManager fragmentManager, List<WebRadio> list, ViewPager viewPager, CoverFlowAdapterListener coverFlowAdapterListener) {
        super(fragmentManager);
        this.f46847fm = fragmentManager;
        this.viewPager = viewPager;
        this.webRadios = list;
        this.listener = coverFlowAdapterListener;
    }

    private String getFragmentTag(int i11) {
        return "android:switcher:" + this.viewPager.getId() + ":" + i11;
    }

    private CoverLinearLayout getRootView(int i11) {
        return (CoverLinearLayout) this.f46847fm.Y(getFragmentTag(i11)).getView().findViewById(R.id.cover_root);
    }

    @Override // androidx.viewpager.widget.e
    public int getCount() {
        return this.webRadios.size();
    }

    @Override // androidx.fragment.app.i0
    public Fragment getItem(int i11) {
        float f11;
        float f12;
        if (i11 == 0) {
            f11 = 1.0f;
            f12 = 1.0f;
        } else {
            f11 = 0.7f;
            f12 = 0.5f;
        }
        return WebRadioSingleViewFragment.createInstance(this.webRadios.get(i11), f11, f12);
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void onPageScrolled(int i11, float f11, int i12) {
        if (f11 >= 0.0f && f11 <= 1.0f) {
            float f12 = 0.3f * f11;
            getRootView(i11).setScaleBoth(1.0f - f12, 1.0f - (f11 / 2.0f));
            float f13 = f12 + 0.7f;
            float f14 = (f11 + 1.0f) / 2.0f;
            if (i11 < getCount() - 1) {
                getRootView(i11 + 1).setScaleBoth(f13, f14);
            }
            if (i11 > 0) {
                getRootView(i11 - 1).setScaleBoth(f13, f14);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void onPageSelected(int i11) {
        CoverFlowAdapterListener coverFlowAdapterListener = this.listener;
        if (coverFlowAdapterListener != null) {
            coverFlowAdapterListener.onCoverScrolled(i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void onPageScrollStateChanged(int i11) {
    }
}
