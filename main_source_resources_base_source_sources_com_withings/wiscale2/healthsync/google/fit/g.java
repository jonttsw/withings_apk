package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncSleepWithFit.kt */
/* loaded from: classes5.dex */
public final class g extends w implements ym0.l<DataPoint, Vasistas> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ImportSleepFromFit f56445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ImportSleepFromFit importSleepFromFit) {
        super(1);
        this.f56445a = importSleepFromFit;
    }

    @Override // ym0.l
    public final Vasistas invoke(DataPoint dataPoint) {
        Vasistas.Category category;
        int i11;
        DataPoint it = dataPoint;
        u.j(it, "it");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        DateTime dateTime = new DateTime(it.getStartTime(timeUnit));
        ImportSleepFromFit importSleepFromFit = this.f56445a;
        Vasistas.VasistasType vasistasType = Vasistas.VasistasType.SLEEP;
        category = importSleepFromFit.f56250i;
        SleepLevel b10 = c.b(it);
        u.g(b10);
        int vasistasType2 = b10.getVasistasType();
        i11 = importSleepFromFit.f56249h;
        return new Vasistas(dateTime, null, Long.valueOf(importSleepFromFit.getUser().q()), (int) (it.getEndTime(timeUnit) - it.getStartTime(timeUnit)), vasistasType, null, category, 0.0f, 0.0f, 0.0f, vasistasType2, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, i11, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -8389728, 2047, null);
    }
}
