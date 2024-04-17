package com.withings.screen.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetDeviceScreens.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.screen.repository.ws.GetDeviceScreens$invoke$2", f = "GetDeviceScreens.kt", l = {28, 29, 33, 35, 38, 40, 41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetDeviceScreens$invoke$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ DateTime $remoteScreenLastUpdate;
    final /* synthetic */ String $syncContext;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GetDeviceScreens this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceScreens$invoke$2(GetDeviceScreens getDeviceScreens, long j5, DateTime dateTime, String str, d<? super GetDeviceScreens$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = getDeviceScreens;
        this.$deviceId = j5;
        this.$remoteScreenLastUpdate = dateTime;
        this.$syncContext = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetDeviceScreens$invoke$2(this.this$0, this.$deviceId, this.$remoteScreenLastUpdate, this.$syncContext, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117 A[LOOP:2: B:39:0x0111->B:41:0x0117, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a A[LOOP:0: B:50:0x0184->B:52:0x018a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.GetDeviceScreens$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetDeviceScreens$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
