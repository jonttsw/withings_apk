package com.withings.target.domain;

import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import com.withings.target.data.api.model.TargetWS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.j;
import org.joda.time.ReadableInstant;
/* compiled from: SaveTargetFromServerUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJC\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/target/domain/SaveTargetFromServerUseCase;", "", "", "Lcom/withings/target/data/api/model/TargetWS;", "receivedTargets", "Lcom/withings/target/Target;", "alreadyExistTarget", "Lnm0/y;", "invoke", "(Ljava/util/List;Ljava/util/List;)V", "Lnm0/j;", "filter$target_release", "(Ljava/util/List;Ljava/util/List;)Lnm0/j;", "filter", "Lcom/withings/target/data/TargetRepository;", "targetRepository", "Lcom/withings/target/data/TargetRepository;", "getTargetRepository", "()Lcom/withings/target/data/TargetRepository;", "<init>", "(Lcom/withings/target/data/TargetRepository;)V", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SaveTargetFromServerUseCase {
    private final TargetRepository targetRepository;

    @Inject
    public SaveTargetFromServerUseCase(TargetRepository targetRepository) {
        u.j(targetRepository, "targetRepository");
        this.targetRepository = targetRepository;
    }

    public final j<List<TargetWS>, List<TargetWS>> filter$target_release(List<TargetWS> receivedTargets, List<Target> alreadyExistTarget) {
        u.j(receivedTargets, "receivedTargets");
        u.j(alreadyExistTarget, "alreadyExistTarget");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean isEmpty = receivedTargets.isEmpty();
        i0 i0Var = i0.f76187a;
        if (isEmpty) {
            return new j<>(i0Var, i0Var);
        }
        if (alreadyExistTarget.isEmpty()) {
            return new j<>(receivedTargets, i0Var);
        }
        for (TargetWS targetWS : receivedTargets) {
            List<Target> list = alreadyExistTarget;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Target target : list) {
                    if (u.e(target.getWsId(), targetWS.getWsId())) {
                        for (Target target2 : list) {
                            if (u.e(target2.getWsId(), targetWS.getWsId())) {
                                if (target2.getModified().compareTo((ReadableInstant) targetWS.getModified()) < 0) {
                                    arrayList2.add(targetWS);
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
            arrayList.add(targetWS);
        }
        return new j<>(arrayList, arrayList2);
    }

    public final TargetRepository getTargetRepository() {
        return this.targetRepository;
    }

    public final void invoke(List<TargetWS> receivedTargets, List<Target> alreadyExistTarget) {
        u.j(receivedTargets, "receivedTargets");
        u.j(alreadyExistTarget, "alreadyExistTarget");
        BuildersKt__BuildersKt.runBlocking$default(null, new SaveTargetFromServerUseCase$invoke$1(this, receivedTargets, alreadyExistTarget, null), 1, null);
    }
}
