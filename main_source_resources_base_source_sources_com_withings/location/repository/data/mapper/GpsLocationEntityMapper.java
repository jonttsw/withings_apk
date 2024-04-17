package com.withings.location.repository.data.mapper;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.model.GpsLocationEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GpsLocationEntityMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "", "()V", "toGpsLocation", "Lcom/withings/location/model/GpsLocation;", "gpsLocationEntity", "Lcom/withings/location/repository/data/model/GpsLocationEntity;", "toGpsLocationEntity", "gpsLocation", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationEntityMapper {
    public final GpsLocation toGpsLocation(GpsLocationEntity gpsLocationEntity) {
        long j5;
        u.j(gpsLocationEntity, "gpsLocationEntity");
        Long id2 = gpsLocationEntity.getId();
        if (id2 != null) {
            j5 = id2.longValue();
        } else {
            j5 = 0;
        }
        return new GpsLocation(j5, gpsLocationEntity.getDate(), new GpsLocation.MetaData(gpsLocationEntity.getUserId(), gpsLocationEntity.getSynced()), new GpsLocation.Position(gpsLocationEntity.getLatitude(), gpsLocationEntity.getLongitude(), gpsLocationEntity.getAltitude()), new GpsLocation.Accuracy(gpsLocationEntity.getHorizontalAccuracy(), gpsLocationEntity.getVerticalAccuracy(), gpsLocationEntity.getSpeedAccuracy(), gpsLocationEntity.getCourseAccuracy()), gpsLocationEntity.getSpeed(), gpsLocationEntity.getCourse());
    }

    public final GpsLocationEntity toGpsLocationEntity(GpsLocation gpsLocation) {
        u.j(gpsLocation, "gpsLocation");
        Long valueOf = Long.valueOf(gpsLocation.getId());
        if (valueOf.longValue() < 0) {
            valueOf = null;
        }
        return new GpsLocationEntity(valueOf, gpsLocation.getMetadata().getUserId(), gpsLocation.getDate(), gpsLocation.getSpeed(), gpsLocation.getAccuracy().getHorizontal(), gpsLocation.getPosition().getAltitude(), gpsLocation.getAccuracy().getVertical(), gpsLocation.getPosition().getLatitude(), gpsLocation.getPosition().getLongitude(), gpsLocation.getAccuracy().getSpeed(), gpsLocation.getBearing(), gpsLocation.getAccuracy().getBearing(), gpsLocation.getMetadata().isSynced(), 0L, UserMetadata.MAX_INTERNAL_KEY_SIZE, null);
    }
}
