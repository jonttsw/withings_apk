package com.withings.device.details.wsd.programs.webradio;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.internal.u;
import ym0.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f37301b;

    public /* synthetic */ c(int i11, l lVar) {
        this.f37300a = i11;
        this.f37301b = lVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i11 = this.f37300a;
        l tmp0 = this.f37301b;
        switch (i11) {
            case 0:
                int i12 = WsdWebRadioActivity.f37279u;
                u.j(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 1:
                int i13 = lb0.d.f79244b;
                u.j(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            default:
                u.j(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }
}
