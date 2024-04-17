package com.withings.common.device.conversation;

import bl.a;
import com.withings.library.authentication.api.ConstantsWs;
import fl.o;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: GetMeasureAndRemoteSyncConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.conversation.GetMeasureAndRemoteSyncConversation$uploadDataToRemote$1", f = "GetMeasureAndRemoteSyncConversation.kt", l = {ConstantsWs.MEASURE_TYPE_HR_ECG, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    GetMeasureAndRemoteSyncConversation f35168a;

    /* renamed from: b  reason: collision with root package name */
    s00.e f35169b;

    /* renamed from: c  reason: collision with root package name */
    o f35170c;

    /* renamed from: d  reason: collision with root package name */
    List f35171d;

    /* renamed from: e  reason: collision with root package name */
    Iterator f35172e;

    /* renamed from: f  reason: collision with root package name */
    long f35173f;

    /* renamed from: g  reason: collision with root package name */
    int f35174g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f35175h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ List<a.C0275a> f35176i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ GetMeasureAndRemoteSyncConversation f35177j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ s00.e f35178k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ o f35179l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Long f35180m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Long f35181n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<ky.d> list, List<a.C0275a> list2, GetMeasureAndRemoteSyncConversation getMeasureAndRemoteSyncConversation, s00.e eVar, o oVar, Long l5, Long l6, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f35175h = list;
        this.f35176i = list2;
        this.f35177j = getMeasureAndRemoteSyncConversation;
        this.f35178k = eVar;
        this.f35179l = oVar;
        this.f35180m = l5;
        this.f35181n = l6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f35175h, this.f35176i, this.f35177j, this.f35178k, this.f35179l, this.f35180m, this.f35181n, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x020b -> B:51:0x020e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0213 -> B:51:0x020e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.device.conversation.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
