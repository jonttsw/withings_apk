package com.withings.views.instruction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import og.y;
/* compiled from: InstructionScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/views/instruction/InstructionScreenData;", "Landroid/os/Parcelable;", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InstructionScreenData implements Parcelable {
    public static final Parcelable.Creator<InstructionScreenData> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Integer f46460a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46461b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46462c;

    /* renamed from: d  reason: collision with root package name */
    private final int f46463d;

    /* renamed from: e  reason: collision with root package name */
    private final String f46464e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f46465f;

    /* compiled from: InstructionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<InstructionScreenData> {
        @Override // android.os.Parcelable.Creator
        public final InstructionScreenData createFromParcel(Parcel parcel) {
            Integer valueOf;
            boolean z5;
            u.j(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            Integer num = valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new InstructionScreenData(num, readString, readString2, readInt, readString3, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final InstructionScreenData[] newArray(int i11) {
            return new InstructionScreenData[i11];
        }
    }

    public InstructionScreenData(Integer num, String title, String subtitle, int i11, String buttonText, boolean z5) {
        u.j(title, "title");
        u.j(subtitle, "subtitle");
        u.j(buttonText, "buttonText");
        this.f46460a = num;
        this.f46461b = title;
        this.f46462c = subtitle;
        this.f46463d = i11;
        this.f46464e = buttonText;
        this.f46465f = z5;
    }

    public final Integer a() {
        return this.f46460a;
    }

    public final String b() {
        return this.f46464e;
    }

    public final int c() {
        return this.f46463d;
    }

    public final String d() {
        return this.f46462c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f46461b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionScreenData)) {
            return false;
        }
        InstructionScreenData instructionScreenData = (InstructionScreenData) obj;
        if (u.e(this.f46460a, instructionScreenData.f46460a) && u.e(this.f46461b, instructionScreenData.f46461b) && u.e(this.f46462c, instructionScreenData.f46462c) && this.f46463d == instructionScreenData.f46463d && u.e(this.f46464e, instructionScreenData.f46464e) && this.f46465f == instructionScreenData.f46465f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f46465f;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f46460a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(this.f46465f) + d.c(this.f46464e, h.a(this.f46463d, d.c(this.f46462c, d.c(this.f46461b, hashCode * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstructionScreenData(backgroundColor=");
        sb2.append(this.f46460a);
        sb2.append(", title=");
        sb2.append(this.f46461b);
        sb2.append(", subtitle=");
        sb2.append(this.f46462c);
        sb2.append(", imageResId=");
        sb2.append(this.f46463d);
        sb2.append(", buttonText=");
        sb2.append(this.f46464e);
        sb2.append(", isButtonOutlined=");
        return h.d(sb2, this.f46465f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Integer num = this.f46460a;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        out.writeString(this.f46461b);
        out.writeString(this.f46462c);
        out.writeInt(this.f46463d);
        out.writeString(this.f46464e);
        out.writeInt(this.f46465f ? 1 : 0);
    }
}
