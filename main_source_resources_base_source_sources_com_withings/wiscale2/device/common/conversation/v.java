package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenGetConversation;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutScreenConversation.kt */
/* loaded from: classes5.dex */
final class v extends w implements ym0.q<Integer, long[], List<? extends ImageMetadata>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutScreenGetConversation.a f50856a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.withings.wiscale2.device.hwa03.b bVar) {
        super(3);
        this.f50856a = bVar;
    }

    @Override // ym0.q
    public final y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
        num.intValue();
        long[] screens = jArr;
        List<? extends ImageMetadata> imageMetadata = list;
        kotlin.jvm.internal.u.j(screens, "screens");
        kotlin.jvm.internal.u.j(imageMetadata, "imageMetadata");
        ((com.withings.wiscale2.device.hwa03.b) this.f50856a).a(screens);
        return y.f85009a;
    }
}
