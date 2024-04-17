package com.withings.wiscale2.activity.workout.live.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
/* compiled from: LiveWorkoutPagerFragment.kt */
/* loaded from: classes4.dex */
public final class n0 extends androidx.fragment.app.i0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f48912a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f48912a = k0Var;
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        List list;
        list = this.f48912a.f48903h;
        return list.size();
    }

    @Override // androidx.fragment.app.i0
    public final Fragment getItem(int i11) {
        List list;
        list = this.f48912a.f48903h;
        return (Fragment) list.get(i11);
    }
}
