package com.withings.ecg.pdf;

import androidx.health.platform.client.proto.x;
import com.withings.ecg.details.b2;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.pdf.b;
import com.withings.user.User;
import kotlin.jvm.internal.u;
/* compiled from: PDFGenerationActivity.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final x f38735a;

    /* renamed from: b  reason: collision with root package name */
    private final User f38736b;

    /* renamed from: c  reason: collision with root package name */
    private final HeartSignalMeasurement f38737c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f38738d;

    /* renamed from: e  reason: collision with root package name */
    private final b2 f38739e;

    public a(x ecgPDF, User user, HeartSignalMeasurement heartSignalMeasurement, b.a aVar, b2 b2Var) {
        u.j(ecgPDF, "ecgPDF");
        this.f38735a = ecgPDF;
        this.f38736b = user;
        this.f38737c = heartSignalMeasurement;
        this.f38738d = aVar;
        this.f38739e = b2Var;
    }

    public final b.a a() {
        return this.f38738d;
    }

    public final HeartSignalMeasurement b() {
        return this.f38737c;
    }

    public final x c() {
        return this.f38735a;
    }

    public final b2 d() {
        return this.f38739e;
    }

    public final User e() {
        return this.f38736b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (u.e(this.f38735a, aVar.f38735a) && u.e(this.f38736b, aVar.f38736b) && u.e(this.f38737c, aVar.f38737c) && u.e(this.f38738d, aVar.f38738d) && u.e(this.f38739e, aVar.f38739e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f38736b.hashCode();
        int hashCode3 = (this.f38737c.hashCode() + ((hashCode2 + (this.f38735a.hashCode() * 31)) * 31)) * 31;
        b.a aVar = this.f38738d;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return this.f38739e.hashCode() + ((hashCode3 + hashCode) * 31);
    }

    public final String toString() {
        return "EcgPDFData(ecgPDF=" + this.f38735a + ", user=" + this.f38736b + ", ecgMeasurement=" + this.f38737c + ", additionalInformation=" + this.f38738d + ", graphEntries=" + this.f38739e + ")";
    }
}
