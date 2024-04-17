package com.withings.wiscale2.settings.changelog;

import com.withings.library.timeline.data.TimelineItem;
import com.withings.user.User;
import com.withings.webservices.legacy.withings.model.timeline.TextItemData;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ww.b;
import ym0.p;
/* compiled from: ChangeLogTimelineDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.settings.changelog.ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1", f = "ChangeLogTimelineDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ User $it;
    final /* synthetic */ TimelineItem<TextItemData> $releaseNoteTimelineItem;
    final /* synthetic */ b $timelineManager;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1(b bVar, User user, TimelineItem<TextItemData> timelineItem, d<? super ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1> dVar) {
        super(2, dVar);
        this.$timelineManager = bVar;
        this.$it = user;
        this.$releaseNoteTimelineItem = timelineItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1(this.$timelineManager, this.$it, this.$releaseNoteTimelineItem, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            this.$timelineManager.k(this.$it.q(), this.$releaseNoteTimelineItem);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
