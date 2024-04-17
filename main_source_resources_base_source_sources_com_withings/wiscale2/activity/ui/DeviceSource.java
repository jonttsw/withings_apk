package com.withings.wiscale2.activity.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: MultiTrackerSources.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/ui/DeviceSource;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceSource implements Parcelable {
    public static final Parcelable.Creator<DeviceSource> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f48529a;

    /* renamed from: b  reason: collision with root package name */
    private final long f48530b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48531c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48532d;

    /* renamed from: e  reason: collision with root package name */
    private float f48533e;

    /* compiled from: MultiTrackerSources.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<DeviceSource> {
        @Override // android.os.Parcelable.Creator
        public final DeviceSource createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            return new DeviceSource(parcel.readInt(), parcel.readLong(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceSource[] newArray(int i11) {
            return new DeviceSource[i11];
        }
    }

    public DeviceSource(int i11, long j5, String deviceName) {
        u.j(deviceName, "deviceName");
        this.f48529a = deviceName;
        this.f48530b = j5;
        this.f48531c = i11;
        this.f48532d = true;
    }

    public final long a() {
        return this.f48530b;
    }

    public final int b() {
        return this.f48531c;
    }

    public final String c() {
        return this.f48529a;
    }

    public final float d() {
        return this.f48533e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f48532d;
    }

    public final void f(boolean z5) {
        this.f48532d = z5;
    }

    public final void g(float f11) {
        this.f48533e = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f48529a);
        out.writeLong(this.f48530b);
        out.writeInt(this.f48531c);
    }
}
