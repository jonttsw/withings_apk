package com.withings.views.explanation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.y1;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import og.y;
/* compiled from: ExplanationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/views/explanation/Explanation;", "Landroid/os/Parcelable;", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Explanation implements Parcelable {
    public static final Parcelable.Creator<Explanation> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Integer f46408a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f46409b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f46410c;

    /* renamed from: d  reason: collision with root package name */
    private final j<String, String> f46411d;

    /* renamed from: e  reason: collision with root package name */
    private final String f46412e;

    /* renamed from: f  reason: collision with root package name */
    private final String f46413f;

    /* renamed from: g  reason: collision with root package name */
    private final String f46414g;

    /* renamed from: h  reason: collision with root package name */
    private final String f46415h;

    /* compiled from: ExplanationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<Explanation> {
        @Override // android.os.Parcelable.Creator
        public final Explanation createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            u.j(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new Explanation(valueOf, valueOf2, valueOf3, (j) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Explanation[] newArray(int i11) {
            return new Explanation[i11];
        }
    }

    public Explanation(Integer num, Integer num2, Integer num3, j<String, String> jVar, String title, String message, String buttonText, String str) {
        u.j(title, "title");
        u.j(message, "message");
        u.j(buttonText, "buttonText");
        this.f46408a = num;
        this.f46409b = num2;
        this.f46410c = num3;
        this.f46411d = jVar;
        this.f46412e = title;
        this.f46413f = message;
        this.f46414g = buttonText;
        this.f46415h = str;
    }

    public final String a() {
        return this.f46414g;
    }

    public final Integer b() {
        return this.f46408a;
    }

    public final Integer c() {
        return this.f46409b;
    }

    public final Integer d() {
        return this.f46410c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final j<String, String> e() {
        return this.f46411d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Explanation)) {
            return false;
        }
        Explanation explanation = (Explanation) obj;
        if (u.e(this.f46408a, explanation.f46408a) && u.e(this.f46409b, explanation.f46409b) && u.e(this.f46410c, explanation.f46410c) && u.e(this.f46411d, explanation.f46411d) && u.e(this.f46412e, explanation.f46412e) && u.e(this.f46413f, explanation.f46413f) && u.e(this.f46414g, explanation.f46414g) && u.e(this.f46415h, explanation.f46415h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f46413f;
    }

    public final String g() {
        return this.f46415h;
    }

    public final String h() {
        return this.f46412e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i11 = 0;
        Integer num = this.f46408a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f46409b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.f46410c;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        j<String, String> jVar = this.f46411d;
        if (jVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = jVar.hashCode();
        }
        int c11 = d.c(this.f46414g, d.c(this.f46413f, d.c(this.f46412e, (i14 + hashCode4) * 31, 31), 31), 31);
        String str = this.f46415h;
        if (str != null) {
            i11 = str.hashCode();
        }
        return c11 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Explanation(headerBackgroundColor=");
        sb2.append(this.f46408a);
        sb2.append(", headerBackgroundDrawable=");
        sb2.append(this.f46409b);
        sb2.append(", image=");
        sb2.append(this.f46410c);
        sb2.append(", lottiePaths=");
        sb2.append(this.f46411d);
        sb2.append(", title=");
        sb2.append(this.f46412e);
        sb2.append(", message=");
        sb2.append(this.f46413f);
        sb2.append(", buttonText=");
        sb2.append(this.f46414g);
        sb2.append(", negativeButtonText=");
        return y1.e(sb2, this.f46415h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Integer num = this.f46408a;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        Integer num2 = this.f46409b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num2);
        }
        Integer num3 = this.f46410c;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num3);
        }
        out.writeSerializable(this.f46411d);
        out.writeString(this.f46412e);
        out.writeString(this.f46413f);
        out.writeString(this.f46414g);
        out.writeString(this.f46415h);
    }

    public /* synthetic */ Explanation(Integer num, j jVar, String str, String str2, String str3, String str4, int i11) {
        this(Integer.valueOf((int) C1987R.color.tutorialBackground_summary), null, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : jVar, str, str2, str3, (i11 & 128) != 0 ? null : str4);
    }
}
