package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataType;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportVasistasToFit.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ExportVasistasToFit", f = "ExportVasistasToFit.kt", l = {93, ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS}, m = "syncVasistas")
/* loaded from: classes5.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ExportVasistasToFit f56417a;

    /* renamed from: b  reason: collision with root package name */
    GoogleSignInAccount f56418b;

    /* renamed from: c  reason: collision with root package name */
    List f56419c;

    /* renamed from: d  reason: collision with root package name */
    t10.e f56420d;

    /* renamed from: e  reason: collision with root package name */
    Iterator f56421e;

    /* renamed from: f  reason: collision with root package name */
    DataType f56422f;

    /* renamed from: g  reason: collision with root package name */
    Iterator f56423g;

    /* renamed from: h  reason: collision with root package name */
    Object f56424h;

    /* renamed from: i  reason: collision with root package name */
    Throwable f56425i;

    /* renamed from: j  reason: collision with root package name */
    /* synthetic */ Object f56426j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ ExportVasistasToFit f56427k;

    /* renamed from: l  reason: collision with root package name */
    int f56428l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExportVasistasToFit exportVasistasToFit, qm0.d<? super a> dVar) {
        super(dVar);
        this.f56427k = exportVasistasToFit;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object A;
        this.f56426j = obj;
        this.f56428l |= Integer.MIN_VALUE;
        A = this.f56427k.A(null, null, null, null, this);
        return A;
    }
}
