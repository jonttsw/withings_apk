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
/* compiled from: GetDeviceScreensContents.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.screen.repository.ws.GetDeviceScreensContents$invoke$2", f = "GetDeviceScreensContents.kt", l = {23, 24, 26, 29, 34}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetDeviceScreensContents$invoke$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ DateTime $remoteScreenContentLastUpdate;
    final /* synthetic */ String $syncContext;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GetDeviceScreensContents this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceScreensContents$invoke$2(GetDeviceScreensContents getDeviceScreensContents, long j5, DateTime dateTime, String str, d<? super GetDeviceScreensContents$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = getDeviceScreensContents;
        this.$deviceId = j5;
        this.$remoteScreenContentLastUpdate = dateTime;
        this.$syncContext = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetDeviceScreensContents$invoke$2(this.this$0, this.$deviceId, this.$remoteScreenContentLastUpdate, this.$syncContext, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f5 -> B:42:0x00ff). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015d -> B:58:0x0160). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.GetDeviceScreensContents$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetDeviceScreensContents$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
