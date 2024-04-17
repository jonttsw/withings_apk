package com.withings.wiscale2.device.common.tutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
/* compiled from: LegacyTutorialActivity.kt */
/* loaded from: classes5.dex */
public final class e extends i0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LegacyTutorialActivity f53551a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LegacyTutorialActivity legacyTutorialActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f53551a = legacyTutorialActivity;
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return LegacyTutorialActivity.J3(this.f53551a).size();
    }

    @Override // androidx.fragment.app.i0
    public final Fragment getItem(int i11) {
        return (vc0.c) LegacyTutorialActivity.J3(this.f53551a).get(i11);
    }
}
