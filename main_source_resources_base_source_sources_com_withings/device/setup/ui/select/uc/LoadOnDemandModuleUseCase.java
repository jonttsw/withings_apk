package com.withings.device.setup.ui.select.uc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import id.b;
import id.j0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuationImpl;
import ym0.l;
/* compiled from: LoadOnDemandModuleUseCase.kt */
/* loaded from: classes3.dex */
public final class LoadOnDemandModuleUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37613a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoadOnDemandModuleUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/ui/select/uc/LoadOnDemandModuleUseCase$Status;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Status {

        /* renamed from: a  reason: collision with root package name */
        public static final Status f37614a;

        /* renamed from: b  reason: collision with root package name */
        public static final Status f37615b;

        /* renamed from: c  reason: collision with root package name */
        public static final Status f37616c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Status[] f37617d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase$Status] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase$Status] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase$Status] */
        static {
            ?? r02 = new Enum("AlreadyInstalled", 0);
            f37614a = r02;
            ?? r12 = new Enum("InstallationSuccess", 1);
            f37615b = r12;
            ?? r22 = new Enum("InstallationFailed", 2);
            f37616c = r22;
            Status[] statusArr = {r02, r12, r22};
            f37617d = statusArr;
            sm0.b.a(statusArr);
        }

        private Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f37617d.clone();
        }
    }

    /* compiled from: LoadOnDemandModuleUseCase.kt */
    /* loaded from: classes3.dex */
    static final class a implements OnSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f37618a;

        a(l lVar) {
            this.f37618a = lVar;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f37618a.invoke(obj);
        }
    }

    @Inject
    public LoadOnDemandModuleUseCase(Context context) {
        this.f37613a = context;
    }

    public final Object a(String str, l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(rm0.a.b(cVar), 1);
        cancellableContinuationImpl.initCancellability();
        id.a zza = j0.a(this.f37613a).zza();
        u.i(zza, "create(...)");
        if (!zza.d().contains(str)) {
            b.a c11 = id.b.c();
            c11.a(str);
            id.b b10 = c11.b();
            p0 p0Var = new p0();
            d dVar = new d(p0Var, lVar, this, cancellableContinuationImpl);
            zza.c(dVar);
            zza.a(b10).addOnSuccessListener(new a(new com.withings.device.setup.ui.select.uc.a(p0Var))).addOnFailureListener(b.f37631a);
            cancellableContinuationImpl.invokeOnCancellation(new c(zza, dVar));
        } else {
            cancellableContinuationImpl.resumeWith(Status.f37614a);
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return result;
    }
}
