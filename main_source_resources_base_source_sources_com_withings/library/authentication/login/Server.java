package com.withings.library.authentication.login;

import com.withings.library.authentication.login.Platform;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Server.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001dBG\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u0082\u0001\u0006\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/withings/library/authentication/login/Server;", "", "scalewsUrl", "", "inappviewsUrl", "maintUrl", "accountUrl", "staticUrl", "cookieDomain", "cookieName", "platform", "Lcom/withings/library/authentication/login/Platform;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Platform;)V", "getAccountUrl", "()Ljava/lang/String;", "getCookieDomain", "getCookieName", "getInappviewsUrl", "getMaintUrl", "getPlatform", "()Lcom/withings/library/authentication/login/Platform;", "getScalewsUrl", "getStaticUrl", "Companion", "MedicalUSBeta", "MedicalUSDev", "MedicalUSProd", "WellnessBeta", "WellnessDev", "WellnessProd", "Lcom/withings/library/authentication/login/Server$MedicalUSBeta;", "Lcom/withings/library/authentication/login/Server$MedicalUSDev;", "Lcom/withings/library/authentication/login/Server$MedicalUSProd;", "Lcom/withings/library/authentication/login/Server$WellnessBeta;", "Lcom/withings/library/authentication/login/Server$WellnessDev;", "Lcom/withings/library/authentication/login/Server$WellnessProd;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Server {
    public static final Companion Companion = new Companion(null);
    private final String accountUrl;
    private final String cookieDomain;
    private final String cookieName;
    private final String inappviewsUrl;
    private final String maintUrl;
    private final Platform platform;
    private final String scalewsUrl;
    private final String staticUrl;

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/Server$Companion;", "", "()V", "fromPlatformAndEnvironment", "Lcom/withings/library/authentication/login/Server;", "platform", "Lcom/withings/library/authentication/login/Platform;", "environment", "Lcom/withings/library/authentication/login/Environment;", "fromScalewsUrl", "url", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Server fromPlatformAndEnvironment(Platform platform, Environment environment) {
            u.j(platform, "platform");
            u.j(environment, "environment");
            for (Server server : x.W(environment.getMedicalUSServer$Authentication_release(), environment.getWellnessServer$Authentication_release())) {
                if (u.e(server.getPlatform(), platform)) {
                    return server;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        public final Server fromScalewsUrl(String url) {
            u.j(url, "url");
            WellnessProd wellnessProd = WellnessProd.INSTANCE;
            if (!u.e(url, wellnessProd.getScalewsUrl())) {
                Server server = WellnessBeta.INSTANCE;
                if (!u.e(url, server.getScalewsUrl())) {
                    server = WellnessDev.INSTANCE;
                    if (!u.e(url, server.getScalewsUrl())) {
                        server = MedicalUSProd.INSTANCE;
                        if (!u.e(url, server.getScalewsUrl())) {
                            server = MedicalUSBeta.INSTANCE;
                            if (!u.e(url, server.getScalewsUrl())) {
                                server = MedicalUSDev.INSTANCE;
                                if (!u.e(url, server.getScalewsUrl())) {
                                    return wellnessProd;
                                }
                            }
                        }
                    }
                }
                return server;
            }
            return wellnessProd;
        }

        private Companion() {
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$MedicalUSBeta;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MedicalUSBeta extends Server {
        public static final MedicalUSBeta INSTANCE = new MedicalUSBeta();

        private MedicalUSBeta() {
            super("https://scalewsbeta.us.withingsmed.com/cgi-bin", "https://inappviewsbeta.us.withingsmed.com", "https://scalewsbeta.us.withingsmed.com/cgi-bin", "https://accountbeta.us.withingsmed.com", "https://static-ssl.withings.com", ".us.withingsmed.com", "medical_session_key", Platform.MedicalUs.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$MedicalUSDev;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MedicalUSDev extends Server {
        public static final MedicalUSDev INSTANCE = new MedicalUSDev();

        private MedicalUSDev() {
            super("https://scalews.corp.withingsmed.com/cgi-bin", "https://inappviews.corp.withingsmed.com", "https://scalews.corp.withingsmed.com/cgi-bin", "https://account.corp.withingsmed.com", "http://static.corp.withings.com", ".corp.withingsmed.com", "wpc-corpsession_key", Platform.MedicalUs.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$MedicalUSProd;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MedicalUSProd extends Server {
        public static final MedicalUSProd INSTANCE = new MedicalUSProd();

        private MedicalUSProd() {
            super("https://scalews.us.withingsmed.com/cgi-bin", "https://inappviews.us.withingsmed.com", "https://scalews.us.withingsmed.com/cgi-bin", "https://account.us.withingsmed.com", "https://static-ssl.withings.com", ".us.withingsmed.com", "medical_session_key", Platform.MedicalUs.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$WellnessBeta;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WellnessBeta extends Server {
        public static final WellnessBeta INSTANCE = new WellnessBeta();

        private WellnessBeta() {
            super("https://scalewsbeta.withings.net/cgi-bin", "https://inappviewsbeta.withings.com", "https://maintwsbeta.withings.net/cgi-bin", "https://accountbeta.withings.com", "https://static-ssl.withings.com", ".withings.com", "session_key", Platform.Wellness.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$WellnessDev;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WellnessDev extends Server {
        public static final WellnessDev INSTANCE = new WellnessDev();

        private WellnessDev() {
            super("https://scalews.corp.withings.com/cgi-bin", "https://inappviews.corp.withings.com", "http://maintws-dev.corp.withings.com/cgi-bin", "https://account.corp.withings.com", "http://static.corp.withings.com", ".corp.withings.com", "corpsession_key", Platform.Wellness.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Server$WellnessProd;", "Lcom/withings/library/authentication/login/Server;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WellnessProd extends Server {
        public static final WellnessProd INSTANCE = new WellnessProd();

        private WellnessProd() {
            super("https://scalews.withings.net/cgi-bin", "https://inappviews.withings.com", "https://maintws.withings.net/cgi-bin", "https://account.withings.com", "https://static-ssl.withings.com", ".withings.com", "session_key", Platform.Wellness.INSTANCE, null);
        }
    }

    public /* synthetic */ Server(String str, String str2, String str3, String str4, String str5, String str6, String str7, Platform platform, m mVar) {
        this(str, str2, str3, str4, str5, str6, str7, platform);
    }

    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final String getCookieDomain() {
        return this.cookieDomain;
    }

    public final String getCookieName() {
        return this.cookieName;
    }

    public final String getInappviewsUrl() {
        return this.inappviewsUrl;
    }

    public final String getMaintUrl() {
        return this.maintUrl;
    }

    public final Platform getPlatform() {
        return this.platform;
    }

    public final String getScalewsUrl() {
        return this.scalewsUrl;
    }

    public final String getStaticUrl() {
        return this.staticUrl;
    }

    private Server(String str, String str2, String str3, String str4, String str5, String str6, String str7, Platform platform) {
        this.scalewsUrl = str;
        this.inappviewsUrl = str2;
        this.maintUrl = str3;
        this.accountUrl = str4;
        this.staticUrl = str5;
        this.cookieDomain = str6;
        this.cookieName = str7;
        this.platform = platform;
    }
}
