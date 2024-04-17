package com.withings.wiscale2.partner.ui.fitdataviewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FitViewerDataTypesActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/partner/ui/fitdataviewer/FitType;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FitType implements Parcelable {
    public static final Parcelable.Creator<FitType> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f59040a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f59041b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Field> f59042c;

    /* compiled from: FitViewerDataTypesActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<FitType> {
        @Override // android.os.Parcelable.Creator
        public final FitType createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            DataType dataType = (DataType) parcel.readParcelable(FitType.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(FitType.class.getClassLoader()));
            }
            return new FitType(readString, dataType, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FitType[] newArray(int i11) {
            return new FitType[i11];
        }
    }

    public FitType(String name, DataType dataType, List<Field> list) {
        u.j(name, "name");
        u.j(dataType, "dataType");
        this.f59040a = name;
        this.f59041b = dataType;
        this.f59042c = list;
    }

    public final DataType a() {
        return this.f59041b;
    }

    public final List<Field> b() {
        return this.f59042c;
    }

    public final String c() {
        return this.f59040a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitType)) {
            return false;
        }
        FitType fitType = (FitType) obj;
        if (u.e(this.f59040a, fitType.f59040a) && u.e(this.f59041b, fitType.f59041b) && u.e(this.f59042c, fitType.f59042c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f59041b.hashCode();
        return this.f59042c.hashCode() + ((hashCode + (this.f59040a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FitType(name=");
        sb2.append(this.f59040a);
        sb2.append(", dataType=");
        sb2.append(this.f59041b);
        sb2.append(", fields=");
        return defpackage.d.i(sb2, this.f59042c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f59040a);
        out.writeParcelable(this.f59041b, i11);
        List<Field> list = this.f59042c;
        out.writeInt(list.size());
        for (Field field : list) {
            out.writeParcelable(field, i11);
        }
    }
}
