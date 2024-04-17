package com.withings.device.setup.ui.select.uc;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.u;
/* compiled from: LoadOnDemandModuleUseCase.kt */
/* loaded from: classes3.dex */
final class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public static final b f37631a = new Object();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception) {
        u.j(exception, "exception");
        x70.b.n(exception);
    }
}
