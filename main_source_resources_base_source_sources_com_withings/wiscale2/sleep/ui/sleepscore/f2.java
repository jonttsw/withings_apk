package com.withings.wiscale2.sleep.ui.sleepscore;

import android.view.View;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepDisorderSectionView;
import com.withings.wiscale2.track.data.Track;
/* compiled from: SleepDisorderSectionView.kt */
/* loaded from: classes5.dex */
final class f2 extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderSectionView f60967a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f60968b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(SleepDisorderSectionView sleepDisorderSectionView, Track track) {
        super(1);
        this.f60967a = sleepDisorderSectionView;
        this.f60968b = track;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        SleepDisorderSectionView.a listener = this.f60967a.getListener();
        if (listener != null) {
            listener.y0(this.f60968b);
        }
        return nm0.y.f85009a;
    }
}
