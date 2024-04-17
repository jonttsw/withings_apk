package com.withings.partner.exchanges.google.healthconnect;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnect.kt */
@e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$clear$1", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEINCREMENT, ConstantsWs.WS_STATUS_WRONGDEVICESN, ConstantsWs.WS_STATUS_WRONGCSVONLY}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    q5.a f43443a;

    /* renamed from: b  reason: collision with root package name */
    Set f43444b;

    /* renamed from: c  reason: collision with root package name */
    String f43445c;

    /* renamed from: d  reason: collision with root package name */
    Collection f43446d;

    /* renamed from: e  reason: collision with root package name */
    Iterator f43447e;

    /* renamed from: f  reason: collision with root package name */
    Object f43448f;

    /* renamed from: g  reason: collision with root package name */
    Collection f43449g;

    /* renamed from: h  reason: collision with root package name */
    int f43450h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f43451i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ String f43452j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, d<? super c> dVar) {
        super(2, dVar);
        this.f43451i = str;
        this.f43452j = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new c(this.f43451i, this.f43452j, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0126 -> B:45:0x01af). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0153 -> B:44:0x01ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0159 -> B:44:0x01ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01a6 -> B:43:0x01aa). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
