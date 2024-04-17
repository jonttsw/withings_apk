package com.withings.library.authentication.login;

import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: Server.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/login/Environment;", "", "wellnessServer", "Lcom/withings/library/authentication/login/Server;", "medicalUSServer", "(Lcom/withings/library/authentication/login/Server;Lcom/withings/library/authentication/login/Server;)V", "getMedicalUSServer$Authentication_release", "()Lcom/withings/library/authentication/login/Server;", "getWellnessServer$Authentication_release", "Beta", "Dev", "Prod", "Lcom/withings/library/authentication/login/Environment$Beta;", "Lcom/withings/library/authentication/login/Environment$Dev;", "Lcom/withings/library/authentication/login/Environment$Prod;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Environment {
    private final Server medicalUSServer;
    private final Server wellnessServer;

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Environment$Beta;", "Lcom/withings/library/authentication/login/Environment;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Beta extends Environment {
        public static final Beta INSTANCE = new Beta();

        private Beta() {
            super(Server.WellnessBeta.INSTANCE, Server.MedicalUSBeta.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Environment$Dev;", "Lcom/withings/library/authentication/login/Environment;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Dev extends Environment {
        public static final Dev INSTANCE = new Dev();

        private Dev() {
            super(Server.WellnessDev.INSTANCE, Server.MedicalUSDev.INSTANCE, null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Environment$Prod;", "Lcom/withings/library/authentication/login/Environment;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Prod extends Environment {
        public static final Prod INSTANCE = new Prod();

        private Prod() {
            super(Server.WellnessProd.INSTANCE, Server.MedicalUSProd.INSTANCE, null);
        }
    }

    public /* synthetic */ Environment(Server server, Server server2, m mVar) {
        this(server, server2);
    }

    public final Server getMedicalUSServer$Authentication_release() {
        return this.medicalUSServer;
    }

    public final Server getWellnessServer$Authentication_release() {
        return this.wellnessServer;
    }

    private Environment(Server server, Server server2) {
        this.wellnessServer = server;
        this.medicalUSServer = server2;
    }
}
