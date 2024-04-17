package com.withings.wiscale2.insight;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.work.impl.g;
import com.withings.library.timeline.data.TimelineItem;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import com.withings.wiscale2.insight.a;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class b extends w implements ym0.a<TimelineItem<InsightItemData>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.b f57869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.b bVar) {
        super(0);
        this.f57869a = bVar;
    }

    @Override // ym0.a
    public final TimelineItem<InsightItemData> invoke() {
        a.b bVar = this.f57869a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TimelineItem.class);
        Fragment fragment = bVar.f57868b;
        if (isAssignableFrom) {
            return (TimelineItem) yq.b.d(fragment, "com.withings.wiscale2.extra.insight_event");
        }
        if (Serializable.class.isAssignableFrom(TimelineItem.class)) {
            return (TimelineItem) yq.b.e(fragment, "com.withings.wiscale2.extra.insight_event");
        }
        throw new IllegalArgumentException(g.a("extra com.withings.wiscale2.extra.insight_event of class ", q0.b(TimelineItem.class), " is not supported"));
    }
}
