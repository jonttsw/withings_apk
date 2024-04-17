package com.withings.target.domain;

import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import com.withings.target.data.api.model.DataConversionKt;
import com.withings.target.data.api.model.TargetWS;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.j;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SaveTargetFromServerUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.domain.SaveTargetFromServerUseCase$invoke$1", f = "SaveTargetFromServerUseCase.kt", l = {19, 20}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveTargetFromServerUseCase$invoke$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ List<Target> $alreadyExistTarget;
    final /* synthetic */ List<TargetWS> $receivedTargets;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SaveTargetFromServerUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveTargetFromServerUseCase$invoke$1(SaveTargetFromServerUseCase saveTargetFromServerUseCase, List<TargetWS> list, List<Target> list2, d<? super SaveTargetFromServerUseCase$invoke$1> dVar) {
        super(2, dVar);
        this.this$0 = saveTargetFromServerUseCase;
        this.$receivedTargets = list;
        this.$alreadyExistTarget = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SaveTargetFromServerUseCase$invoke$1(this.this$0, this.$receivedTargets, this.$alreadyExistTarget, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j<List<TargetWS>, List<TargetWS>> filter$target_release;
        SaveTargetFromServerUseCase saveTargetFromServerUseCase;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            filter$target_release = (j) this.L$1;
            saveTargetFromServerUseCase = (SaveTargetFromServerUseCase) this.L$0;
            l.b(obj);
        } else {
            l.b(obj);
            filter$target_release = this.this$0.filter$target_release(this.$receivedTargets, this.$alreadyExistTarget);
            saveTargetFromServerUseCase = this.this$0;
            TargetRepository targetRepository = saveTargetFromServerUseCase.getTargetRepository();
            List<TargetWS> c11 = filter$target_release.c();
            ArrayList arrayList = new ArrayList(x.y(c11, 10));
            for (TargetWS targetWS : c11) {
                arrayList.add(DataConversionKt.toEntity(targetWS, true));
            }
            this.L$0 = saveTargetFromServerUseCase;
            this.L$1 = filter$target_release;
            this.label = 1;
            if (targetRepository.saveTargets(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        TargetRepository targetRepository2 = saveTargetFromServerUseCase.getTargetRepository();
        List<TargetWS> d11 = filter$target_release.d();
        ArrayList arrayList2 = new ArrayList(x.y(d11, 10));
        for (TargetWS targetWS2 : d11) {
            arrayList2.add(DataConversionKt.toEntity(targetWS2, true));
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (targetRepository2.updateHRTarget(arrayList2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SaveTargetFromServerUseCase$invoke$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
