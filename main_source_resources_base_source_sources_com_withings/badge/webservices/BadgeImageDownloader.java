package com.withings.badge.webservices;

import android.content.Context;
import bi.a;
import com.withings.library.authentication.api.ConstantsWs;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import w9.g;
/* compiled from: BadgeImageDownloader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/withings/badge/webservices/BadgeImageDownloader;", "", "", "badgeId", "Lnm0/y;", "downloadImages", "(Ljava/lang/String;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lbi/a;", "urlProvider", "Lbi/a;", "<init>", "(Landroid/content/Context;)V", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BadgeImageDownloader {
    public static final int $stable = 8;
    private final Context context;
    private final a urlProvider;

    /* JADX WARN: Type inference failed for: r2v1, types: [bi.a, java.lang.Object] */
    public BadgeImageDownloader(Context context) {
        u.j(context, "context");
        this.context = context;
        this.urlProvider = new Object();
    }

    public final void downloadImages(String badgeId) {
        u.j(badgeId, "badgeId");
        g a11 = w9.a.a(this.context);
        f.a aVar = new f.a(this.context);
        this.urlProvider.getClass();
        aVar.d(a.a(badgeId));
        a11.d(aVar.b());
        g a12 = w9.a.a(this.context);
        f.a aVar2 = new f.a(this.context);
        this.urlProvider.getClass();
        aVar2.d(a.b(badgeId));
        a12.d(aVar2.b());
    }
}
