package com.withings.wiscale2.healthsync.google.fit;

import androidx.activity.b0;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* compiled from: MeasureImportWorker.kt */
/* loaded from: classes5.dex */
final class j extends w implements ym0.l<DataPoint, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f56462a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<ky.d> list) {
        super(1);
        this.f56462a = list;
    }

    @Override // ym0.l
    public final Boolean invoke(DataPoint dataPoint) {
        DataPoint it = dataPoint;
        u.j(it, "it");
        DateTime dateTime = new DateTime(it.getTimestamp(TimeUnit.MILLISECONDS));
        List<ky.d> list = this.f56462a;
        boolean z5 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DateTime dateTime2 = new DateTime(((ky.d) it2.next()).c().getMillis());
                DateTime minusSeconds = dateTime2.minusSeconds(5);
                u.i(minusSeconds, "minusSeconds(...)");
                DateTime plusSeconds = dateTime2.plusSeconds(5);
                u.i(plusSeconds, "plusSeconds(...)");
                if (b0.q(dateTime, minusSeconds, plusSeconds)) {
                    z5 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z5);
    }
}
