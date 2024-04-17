package com.withings.wiscale2.settings;

import com.withings.library.authentication.login.AuthenticationService;
import ep0.a;
import javax.inject.Inject;
import kotlin.time.DurationUnit;
/* compiled from: LogoutAndDisconnectDevicesImpl.kt */
/* loaded from: classes5.dex */
public final class k0 implements qf.a {

    /* renamed from: g  reason: collision with root package name */
    private static final long f60092g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f60093h;

    /* renamed from: a  reason: collision with root package name */
    private final fl.e f60094a;

    /* renamed from: b  reason: collision with root package name */
    private final ej.w f60095b;

    /* renamed from: c  reason: collision with root package name */
    private final oi0.b f60096c;

    /* renamed from: d  reason: collision with root package name */
    private final AuthenticationService f60097d;

    /* renamed from: e  reason: collision with root package name */
    private final cg.l f60098e;

    /* renamed from: f  reason: collision with root package name */
    private final rh.i f60099f;

    static {
        a.C0892a c0892a = ep0.a.f65838b;
        DurationUnit durationUnit = DurationUnit.f78024d;
        f60092g = ep0.c.j(2, durationUnit);
        f60093h = ep0.c.j(10, durationUnit);
    }

    @Inject
    public k0(fl.e eVar, ej.w wVar, oi0.b wsSyncManager, AuthenticationService authenticationService, cg.l lVar, rh.i iVar) {
        kotlin.jvm.internal.u.j(wsSyncManager, "wsSyncManager");
        kotlin.jvm.internal.u.j(authenticationService, "authenticationService");
        this.f60094a = eVar;
        this.f60095b = wVar;
        this.f60096c = wsSyncManager;
        this.f60097d = authenticationService;
        this.f60098e = lVar;
        this.f60099f = iVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0147 -> B:55:0x014a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r18, qm0.d r19, ym0.l r20) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.k0.a(android.content.Context, qm0.d, ym0.l):java.lang.Object");
    }
}
