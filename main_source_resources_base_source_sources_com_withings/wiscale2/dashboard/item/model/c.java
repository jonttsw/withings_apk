package com.withings.wiscale2.dashboard.item.model;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.withings.device.Device;
import com.withings.user.User;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: SummaryItemData.kt */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f50566a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50567b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50568c;

    /* renamed from: d  reason: collision with root package name */
    private final User f50569d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f50570e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Device> f50571f;

    /* renamed from: g  reason: collision with root package name */
    private final d f50572g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String id2, int i11, int i12, User user, boolean z5, List<? extends Device> relatedDevices, d dVar) {
        u.j(id2, "id");
        u.j(user, "user");
        u.j(relatedDevices, "relatedDevices");
        this.f50566a = id2;
        this.f50567b = i11;
        this.f50568c = i12;
        this.f50569d = user;
        this.f50570e = z5;
        this.f50571f = relatedDevices;
        this.f50572g = dVar;
    }

    public final int a() {
        return this.f50567b;
    }

    public final d b() {
        return this.f50572g;
    }

    public final String c() {
        return this.f50566a;
    }

    public final int d() {
        return this.f50568c;
    }

    public final List<Device> e() {
        return this.f50571f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (u.e(this.f50566a, cVar.f50566a) && this.f50567b == cVar.f50567b && this.f50568c == cVar.f50568c && u.e(this.f50569d, cVar.f50569d) && this.f50570e == cVar.f50570e && u.e(this.f50571f, cVar.f50571f) && u.e(this.f50572g, cVar.f50572g)) {
            return true;
        }
        return false;
    }

    public final User f() {
        return this.f50569d;
    }

    public final boolean g() {
        return this.f50570e;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = h.a(this.f50568c, h.a(this.f50567b, this.f50566a.hashCode() * 31, 31), 31);
        int b10 = defpackage.e.b(this.f50571f, y1.a(this.f50570e, (this.f50569d.hashCode() + a11) * 31, 31), 31);
        d dVar = this.f50572g;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        return "SummaryItem(id=" + this.f50566a + ", ciId=" + this.f50567b + ", itemName=" + this.f50568c + ", user=" + this.f50569d + ", isAvailable=" + this.f50570e + ", relatedDevices=" + this.f50571f + ", data=" + this.f50572g + ")";
    }
}
