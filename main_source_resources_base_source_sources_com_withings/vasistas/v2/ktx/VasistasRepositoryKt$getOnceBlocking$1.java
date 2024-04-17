package com.withings.vasistas.v2.ktx;

import com.withings.vasistas.v2.repository.VasistasRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: VasistasRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/withings/vasistas/v2/model/Vasistas;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.vasistas.v2.ktx.VasistasRepositoryKt$getOnceBlocking$1", f = "VasistasRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class VasistasRepositoryKt$getOnceBlocking$1<T> extends i implements p<CoroutineScope, d<? super List<? extends T>>, Object> {
    final /* synthetic */ DateTime $from;
    final /* synthetic */ VasistasRepository $this_getOnceBlocking;
    final /* synthetic */ DateTime $to;
    final /* synthetic */ long $userId;
    final /* synthetic */ Class<T> $vasistasClass;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VasistasRepositoryKt$getOnceBlocking$1(VasistasRepository vasistasRepository, Class<T> cls, long j5, DateTime dateTime, DateTime dateTime2, d<? super VasistasRepositoryKt$getOnceBlocking$1> dVar) {
        super(2, dVar);
        this.$this_getOnceBlocking = vasistasRepository;
        this.$vasistasClass = cls;
        this.$userId = j5;
        this.$from = dateTime;
        this.$to = dateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new VasistasRepositoryKt$getOnceBlocking$1(this.$this_getOnceBlocking, this.$vasistasClass, this.$userId, this.$from, this.$to, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object obj) {
        return invoke(coroutineScope, (d) ((d) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            VasistasRepository vasistasRepository = this.$this_getOnceBlocking;
            Class<T> cls = this.$vasistasClass;
            long j5 = this.$userId;
            DateTime dateTime = this.$from;
            DateTime dateTime2 = this.$to;
            this.label = 1;
            obj = VasistasRepositoryKt.getOnce(vasistasRepository, cls, j5, dateTime, dateTime2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    public final Object invoke(CoroutineScope coroutineScope, d<? super List<? extends T>> dVar) {
        return ((VasistasRepositoryKt$getOnceBlocking$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
