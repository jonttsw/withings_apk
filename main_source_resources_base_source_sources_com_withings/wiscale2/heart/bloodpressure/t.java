package com.withings.wiscale2.heart.bloodpressure;

import android.content.DialogInterface;
import com.withings.wiscale2.heart.heartrate.x0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f57449a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f57450b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f57451c;

    public /* synthetic */ t(Object obj, androidx.appcompat.app.c cVar, int i11) {
        this.f57449a = i11;
        this.f57451c = obj;
        this.f57450b = cVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i11 = this.f57449a;
        androidx.appcompat.app.c cVar = this.f57450b;
        Object obj = this.f57451c;
        switch (i11) {
            case 0:
                BloodPressureMeasureListActivity.B3((BloodPressureMeasureListActivity) obj, cVar);
                return;
            default:
                x0.s1((x0) obj, cVar);
                return;
        }
    }
}
