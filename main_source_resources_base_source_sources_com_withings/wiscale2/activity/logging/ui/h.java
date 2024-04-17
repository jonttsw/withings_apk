package com.withings.wiscale2.activity.logging.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.withings.wiscale2.C1987R;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f48349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f48350b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f48351c;

    public /* synthetic */ h(Object obj, androidx.appcompat.app.c cVar, int i11) {
        this.f48349a = i11;
        this.f48351c = obj;
        this.f48350b = cVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i11 = this.f48349a;
        androidx.appcompat.app.c cVar = this.f48350b;
        Object obj = this.f48351c;
        switch (i11) {
            case 0:
                EditWorkoutActivity.N3((EditWorkoutActivity) obj, cVar);
                return;
            default:
                int i12 = og0.i.f86861o;
                Context requireContext = ((og0.i) obj).requireContext();
                cVar.g(-2).setTextColor(ah.u.v(C1987R.attr.colorOnSurface, requireContext));
                cVar.g(-1).setTextColor(ah.u.v(C1987R.attr.colorError, requireContext));
                return;
        }
    }
}
