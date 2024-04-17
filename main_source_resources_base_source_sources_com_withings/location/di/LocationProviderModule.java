package com.withings.location.di;

import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.domain.uc.ComputeElevation;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeGpsSummary;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.domain.uc.CountTotalGapDuration;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.GpsLocationFilter;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.ws.RetrofitGpsLocationRemoteRepository;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s00.b;
/* compiled from: LocationModule.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b#\u0010$J'\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/withings/location/di/LocationProviderModule;", "", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "provideFilterGpsLocationWithPause", "()Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "Lcom/withings/location/domain/GpsDistanceComputer;", "gpsDistanceComputer", "Lcom/withings/location/domain/uc/CountTotalGapDuration;", "provideCountTotalGapDuration", "(Lcom/withings/location/domain/GpsDistanceComputer;)Lcom/withings/location/domain/uc/CountTotalGapDuration;", "countTotalGapDuration", "Lcom/withings/location/domain/uc/HasEnoughGpsLocations;", "provideHasEnoughGpsLocations", "(Lcom/withings/location/domain/uc/CountTotalGapDuration;)Lcom/withings/location/domain/uc/HasEnoughGpsLocations;", "Lcom/withings/location/domain/uc/GpsLocationFilter;", "provideGpsLocationFilter", "(Lcom/withings/location/domain/GpsDistanceComputer;)Lcom/withings/location/domain/uc/GpsLocationFilter;", "Lcom/withings/location/domain/uc/ComputeGpsDistance;", "computeGpsDistance", "Lcom/withings/location/domain/uc/ComputeSpeed;", "provideComputeSpeed", "(Lcom/withings/location/domain/uc/ComputeGpsDistance;)Lcom/withings/location/domain/uc/ComputeSpeed;", "Lcom/withings/location/domain/uc/ComputeElevation;", "provideComputeElevation", "(Lcom/withings/location/domain/GpsDistanceComputer;)Lcom/withings/location/domain/uc/ComputeElevation;", "computeSpeed", "Lcom/withings/location/domain/uc/ComputePace;", "provideComputePace", "(Lcom/withings/location/domain/uc/ComputeSpeed;)Lcom/withings/location/domain/uc/ComputePace;", "gpsLocationFilter", "filterGpsLocationWithPause", "provideComputeGpsDistance", "(Lcom/withings/location/domain/GpsDistanceComputer;Lcom/withings/location/domain/uc/GpsLocationFilter;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;)Lcom/withings/location/domain/uc/ComputeGpsDistance;", "hasEnoughGpsLocations", "Lcom/withings/location/domain/uc/ComputeGpsSummary;", "provideComputeGpsSummary", "(Lcom/withings/location/domain/uc/HasEnoughGpsLocations;Lcom/withings/location/domain/uc/ComputeGpsDistance;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;)Lcom/withings/location/domain/uc/ComputeGpsSummary;", "Lcom/withings/location/domain/uc/ComputeSplits;", "provideComputeSplit", "(Lcom/withings/location/domain/uc/ComputeGpsDistance;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;Lcom/withings/location/domain/uc/GpsLocationFilter;)Lcom/withings/location/domain/uc/ComputeSplits;", "Ls00/b;", "compatWebservicesFactory", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "provideGpsLocationRemoteRepository", "(Ls00/b;)Lcom/withings/location/repository/GpsLocationRemoteRepository;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocationProviderModule {
    public static final LocationProviderModule INSTANCE = new LocationProviderModule();

    private LocationProviderModule() {
    }

    public final ComputeElevation provideComputeElevation(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        return new ComputeElevation(gpsDistanceComputer);
    }

    public final ComputeGpsDistance provideComputeGpsDistance(GpsDistanceComputer gpsDistanceComputer, GpsLocationFilter gpsLocationFilter, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        u.j(gpsLocationFilter, "gpsLocationFilter");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        return new ComputeGpsDistance(gpsDistanceComputer, gpsLocationFilter, filterGpsLocationWithPause);
    }

    public final ComputeGpsSummary provideComputeGpsSummary(HasEnoughGpsLocations hasEnoughGpsLocations, ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        u.j(hasEnoughGpsLocations, "hasEnoughGpsLocations");
        u.j(computeGpsDistance, "computeGpsDistance");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        return new ComputeGpsSummary(hasEnoughGpsLocations, computeGpsDistance, filterGpsLocationWithPause);
    }

    public final ComputePace provideComputePace(ComputeSpeed computeSpeed) {
        u.j(computeSpeed, "computeSpeed");
        return new ComputePace(computeSpeed);
    }

    public final ComputeSpeed provideComputeSpeed(ComputeGpsDistance computeGpsDistance) {
        u.j(computeGpsDistance, "computeGpsDistance");
        return new ComputeSpeed(computeGpsDistance);
    }

    public final ComputeSplits provideComputeSplit(ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause, GpsLocationFilter gpsLocationFilter) {
        u.j(computeGpsDistance, "computeGpsDistance");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        u.j(gpsLocationFilter, "gpsLocationFilter");
        return new ComputeSplits(computeGpsDistance, filterGpsLocationWithPause, gpsLocationFilter);
    }

    public final CountTotalGapDuration provideCountTotalGapDuration(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        return new CountTotalGapDuration(gpsDistanceComputer);
    }

    public final FilterGpsLocationWithPause provideFilterGpsLocationWithPause() {
        return new FilterGpsLocationWithPause();
    }

    public final GpsLocationFilter provideGpsLocationFilter(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        return new GpsLocationFilter(gpsDistanceComputer);
    }

    @Singleton
    public final GpsLocationRemoteRepository provideGpsLocationRemoteRepository(b compatWebservicesFactory) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        return new RetrofitGpsLocationRemoteRepository(compatWebservicesFactory, null, 2, null);
    }

    public final HasEnoughGpsLocations provideHasEnoughGpsLocations(CountTotalGapDuration countTotalGapDuration) {
        u.j(countTotalGapDuration, "countTotalGapDuration");
        return new HasEnoughGpsLocations(countTotalGapDuration);
    }
}
