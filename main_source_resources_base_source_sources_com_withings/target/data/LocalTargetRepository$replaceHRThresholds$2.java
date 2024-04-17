package com.withings.target.data;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.data.LocalTargetRepository$replaceHRThresholds$2", f = "LocalTargetRepository.kt", l = {ConstantsWs.WS_STATUS_UNAUTHORIZED, ConstantsWs.WS_STATUS_NOHEIGHT, ConstantsWs.WS_STATUS_ACCOUNTUPDATEERROR, ConstantsWs.WS_STATUS_WRONGAPPLI}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$replaceHRThresholds$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ List<Target> $targets;
    final /* synthetic */ long $userId;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$replaceHRThresholds$2(List<Target> list, LocalTargetRepository localTargetRepository, long j5, d<? super LocalTargetRepository$replaceHRThresholds$2> dVar) {
        super(2, dVar);
        this.$targets = list;
        this.this$0 = localTargetRepository;
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LocalTargetRepository$replaceHRThresholds$2(this.$targets, this.this$0, this.$userId, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00dc -> B:14:0x0052). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository$replaceHRThresholds$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LocalTargetRepository$replaceHRThresholds$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
