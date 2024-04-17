package com.withings.wiscale2;

import android.content.DialogInterface;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f62940a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f62941b;

    public /* synthetic */ y1(Object obj, int i11) {
        this.f62940a = i11;
        this.f62941b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f62940a;
        Object obj = this.f62941b;
        switch (i12) {
            case 0:
                MainActivity.z3((MainActivity) obj);
                return;
            default:
                va0.d this$0 = (va0.d) obj;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (i11 == 0) {
                    this$0.h();
                    return;
                } else {
                    this$0.j();
                    return;
                }
        }
    }
}
