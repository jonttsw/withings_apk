package com.withings.location.di;

import com.withings.location.domain.AndroidGpsDistanceComputer;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.RoomGpsLocationRepository;
import kotlin.Metadata;
/* compiled from: LocationModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/withings/location/di/LocationBinderModule;", "", "()V", "bindDistanceComputer", "Lcom/withings/location/domain/GpsDistanceComputer;", "androidGpsDistanceComputer", "Lcom/withings/location/domain/AndroidGpsDistanceComputer;", "bindRepository", "Lcom/withings/location/repository/GpsLocationRepository;", "roomGpsLocationRepository", "Lcom/withings/location/repository/RoomGpsLocationRepository;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LocationBinderModule {
    public abstract GpsDistanceComputer bindDistanceComputer(AndroidGpsDistanceComputer androidGpsDistanceComputer);

    public abstract GpsLocationRepository bindRepository(RoomGpsLocationRepository roomGpsLocationRepository);
}
