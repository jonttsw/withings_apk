package com.withings.target;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.target.data.TargetRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import nm0.y;
import org.jivesoftware.smack.packet.Message;
import ym0.l;
/* compiled from: TargetObserver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/target/data/TargetRepository;", "", NavigationArguments.USER_ID, "Lkotlin/Function1;", "Lcom/withings/target/Target;", "Lnm0/y;", Message.BODY, "Lkotlinx/coroutines/Job;", "observeStepTarget", "(Lcom/withings/target/data/TargetRepository;JLym0/l;)Lkotlinx/coroutines/Job;", "observeStepTargetUpdateForTrackerSync", "(Lcom/withings/target/data/TargetRepository;Lym0/l;)Lkotlinx/coroutines/Job;", "target_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TargetObserverKt {
    public static final Job observeStepTarget(TargetRepository targetRepository, long j5, l<? super Target, y> body) {
        Job launch$default;
        u.j(targetRepository, "<this>");
        u.j(body, "body");
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new TargetObserverKt$observeStepTarget$1(targetRepository, j5, body, null), 3, null);
        return launch$default;
    }

    public static final Job observeStepTargetUpdateForTrackerSync(TargetRepository targetRepository, l<? super Long, y> body) {
        Job launch$default;
        u.j(targetRepository, "<this>");
        u.j(body, "body");
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new TargetObserverKt$observeStepTargetUpdateForTrackerSync$1(targetRepository, body, null), 3, null);
        return launch$default;
    }
}
