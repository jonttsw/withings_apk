package com.withings.wiscale2.vasistas.body;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import androidx.compose.material.o;
import kj0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HRZonesAggregate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/vasistas/body/HRZonesAggregate;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HRZonesAggregate implements Parcelable {
    public static final Parcelable.Creator<HRZonesAggregate> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private float f62572a;

    /* renamed from: b  reason: collision with root package name */
    private float f62573b;

    /* renamed from: c  reason: collision with root package name */
    private float f62574c;

    /* renamed from: d  reason: collision with root package name */
    private float f62575d;

    /* renamed from: e  reason: collision with root package name */
    private int f62576e;

    /* renamed from: f  reason: collision with root package name */
    private int f62577f;

    /* renamed from: g  reason: collision with root package name */
    private int f62578g;

    /* compiled from: HRZonesAggregate.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<HRZonesAggregate> {
        @Override // android.os.Parcelable.Creator
        public final HRZonesAggregate createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new HRZonesAggregate(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HRZonesAggregate[] newArray(int i11) {
            return new HRZonesAggregate[i11];
        }
    }

    public HRZonesAggregate() {
        this(0, 0, 127);
    }

    public final void a(kj0.a aVar, float f11) {
        if (aVar instanceof a.b) {
            this.f62575d += f11;
        } else if (aVar instanceof a.c) {
            this.f62574c += f11;
        } else if (aVar instanceof a.C1181a) {
            this.f62573b += f11;
        } else {
            this.f62572a += f11;
        }
    }

    public final int b() {
        return this.f62576e;
    }

    public final float c() {
        return this.f62573b;
    }

    public final float d() {
        return this.f62575d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f62578g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HRZonesAggregate)) {
            return false;
        }
        HRZonesAggregate hRZonesAggregate = (HRZonesAggregate) obj;
        if (Float.compare(this.f62572a, hRZonesAggregate.f62572a) == 0 && Float.compare(this.f62573b, hRZonesAggregate.f62573b) == 0 && Float.compare(this.f62574c, hRZonesAggregate.f62574c) == 0 && Float.compare(this.f62575d, hRZonesAggregate.f62575d) == 0 && this.f62576e == hRZonesAggregate.f62576e && this.f62577f == hRZonesAggregate.f62577f && this.f62578g == hRZonesAggregate.f62578g) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f62577f;
    }

    public final float g() {
        return this.f62574c;
    }

    public final float h() {
        return this.f62572a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62578g) + h.a(this.f62577f, h.a(this.f62576e, o.a(this.f62575d, o.a(this.f62574c, o.a(this.f62573b, Float.hashCode(this.f62572a) * 31, 31), 31), 31), 31), 31);
    }

    public final float i() {
        return this.f62572a + this.f62573b + this.f62574c + this.f62575d;
    }

    public final void j(int i11) {
        this.f62576e = i11;
    }

    public final void k(float f11) {
        this.f62573b = f11;
    }

    public final void l(float f11) {
        this.f62575d = f11;
    }

    public final void o(float f11) {
        this.f62574c = f11;
    }

    public final void p(float f11) {
        this.f62572a = f11;
    }

    public final String toString() {
        float f11 = this.f62572a;
        float f12 = this.f62573b;
        float f13 = this.f62574c;
        float f14 = this.f62575d;
        int i11 = this.f62576e;
        StringBuilder sb2 = new StringBuilder("HRZonesAggregate(peakTimeSeconds=");
        sb2.append(f11);
        sb2.append(", intenseTimeSeconds=");
        sb2.append(f12);
        sb2.append(", moderateTimeSeconds=");
        sb2.append(f13);
        sb2.append(", lightTimeSeconds=");
        sb2.append(f14);
        sb2.append(", averageValue=");
        sb2.append(i11);
        sb2.append(", minHR=");
        sb2.append(this.f62577f);
        sb2.append(", maxHR=");
        return e.c(sb2, this.f62578g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeFloat(this.f62572a);
        out.writeFloat(this.f62573b);
        out.writeFloat(this.f62574c);
        out.writeFloat(this.f62575d);
        out.writeInt(this.f62576e);
        out.writeInt(this.f62577f);
        out.writeInt(this.f62578g);
    }

    public HRZonesAggregate(float f11, float f12, float f13, float f14, int i11, int i12, int i13) {
        this.f62572a = f11;
        this.f62573b = f12;
        this.f62574c = f13;
        this.f62575d = f14;
        this.f62576e = i11;
        this.f62577f = i12;
        this.f62578g = i13;
    }

    public /* synthetic */ HRZonesAggregate(int i11, int i12, int i13) {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12);
    }
}
