package com.withings.wiscale2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class h2 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f56171a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(MainActivity mainActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f56171a = mainActivity;
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        ArrayList arrayList;
        arrayList = this.f56171a.f47957i;
        return arrayList.size();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        ArrayList arrayList;
        arrayList = this.f56171a.f47957i;
        Object obj = arrayList.get(i11);
        kotlin.jvm.internal.u.i(obj, "get(...)");
        return (Fragment) obj;
    }
}
