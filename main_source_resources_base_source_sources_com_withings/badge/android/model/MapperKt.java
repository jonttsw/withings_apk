package com.withings.badge.android.model;

import ai.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import xh.b;
/* compiled from: Mapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/badge/android/model/Badge;", "Lai/a;", "toCoreModel", "(Lcom/withings/badge/android/model/Badge;)Lai/a;", "toDatabaseModel", "(Lai/a;)Lcom/withings/badge/android/model/Badge;", "Lxh/b;", "(Lxh/b;)Lai/a;", "android_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MapperKt {
    public static final a toCoreModel(Badge badge) {
        u.j(badge, "<this>");
        Long localId = badge.getLocalId();
        long userId = badge.getUserId();
        int badgeType = badge.getBadgeType();
        String id2 = badge.getId();
        String title = badge.getTitle();
        String subTitle = badge.getSubTitle();
        int value = badge.getValue();
        String unit = badge.getUnit();
        String shortDesc = badge.getShortDesc();
        String longDesc = badge.getLongDesc();
        String learnMoreText = badge.getLearnMoreText();
        String learnMorePhoto = badge.getLearnMorePhoto();
        String message = badge.getMessage();
        String shareText = badge.getShareText();
        String date = badge.getDate();
        DateTime modified = badge.getModified();
        return new a(localId, userId, badgeType, id2, title, subTitle, value, unit, shortDesc, longDesc, learnMoreText, learnMorePhoto, message, shareText, date, modified != null ? modified.toInstant() : null);
    }

    public static final Badge toDatabaseModel(a aVar) {
        DateTime dateTime;
        u.j(aVar, "<this>");
        Long g11 = aVar.g();
        long p11 = aVar.p();
        int b10 = aVar.b();
        String d11 = aVar.d();
        String n11 = aVar.n();
        String m11 = aVar.m();
        int q11 = aVar.q();
        String o11 = aVar.o();
        String l5 = aVar.l();
        String h11 = aVar.h();
        String f11 = aVar.f();
        String e11 = aVar.e();
        String i11 = aVar.i();
        String k11 = aVar.k();
        String c11 = aVar.c();
        Instant j5 = aVar.j();
        if (j5 != null) {
            dateTime = j5.toDateTime();
        } else {
            dateTime = null;
        }
        return new Badge(g11, p11, b10, d11, n11, m11, q11, o11, l5, h11, f11, e11, i11, k11, c11, dateTime);
    }

    public static final a toCoreModel(b bVar) {
        u.j(bVar, "<this>");
        Long f11 = bVar.f();
        long o11 = bVar.o();
        int a11 = bVar.a();
        String c11 = bVar.c();
        String m11 = bVar.m();
        String l5 = bVar.l();
        int p11 = bVar.p();
        String n11 = bVar.n();
        String k11 = bVar.k();
        String g11 = bVar.g();
        String e11 = bVar.e();
        String d11 = bVar.d();
        String h11 = bVar.h();
        String j5 = bVar.j();
        String b10 = bVar.b();
        DateTime i11 = bVar.i();
        return new a(f11, o11, a11, c11, m11, l5, p11, n11, k11, g11, e11, d11, h11, j5, b10, i11 != null ? i11.toInstant() : null);
    }
}
