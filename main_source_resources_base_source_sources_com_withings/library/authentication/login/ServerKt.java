package com.withings.library.authentication.login;

import com.withings.library.authentication.login.Environment;
import com.withings.library.authentication.login.Server;
import dp0.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: Server.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\f\u0010\r\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"defaultServer", "Lcom/withings/library/authentication/login/Server;", "Lcom/withings/library/authentication/login/Environment;", "getDefaultServer", "(Lcom/withings/library/authentication/login/Environment;)Lcom/withings/library/authentication/login/Server;", "scalewsBaseUrl", "", "getScalewsBaseUrl", "(Lcom/withings/library/authentication/login/Server;)Ljava/lang/String;", "wellnessPlatformId", "", "getWellnessPlatformId", "(Lcom/withings/library/authentication/login/Environment;)I", "getEnvironment", "getServer", "serverId", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServerKt {
    public static final Server getDefaultServer(Environment environment) {
        u.j(environment, "<this>");
        return environment.getWellnessServer$Authentication_release();
    }

    public static final Environment getEnvironment(Server server) {
        u.j(server, "<this>");
        if (u.e(server, Server.MedicalUSBeta.INSTANCE)) {
            return Environment.Beta.INSTANCE;
        }
        if (u.e(server, Server.MedicalUSDev.INSTANCE)) {
            return Environment.Dev.INSTANCE;
        }
        if (u.e(server, Server.MedicalUSProd.INSTANCE)) {
            return Environment.Prod.INSTANCE;
        }
        if (u.e(server, Server.WellnessBeta.INSTANCE)) {
            return Environment.Beta.INSTANCE;
        }
        if (u.e(server, Server.WellnessDev.INSTANCE)) {
            return Environment.Dev.INSTANCE;
        }
        if (u.e(server, Server.WellnessProd.INSTANCE)) {
            return Environment.Prod.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getScalewsBaseUrl(Server server) {
        u.j(server, "<this>");
        return j.L("https://", j.L("http://", server.getScalewsUrl()));
    }

    public static final Server getServer(Environment environment, int i11) {
        u.j(environment, "<this>");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return getDefaultServer(environment);
                    }
                    return environment.getMedicalUSServer$Authentication_release();
                }
                return environment.getMedicalUSServer$Authentication_release();
            }
            return environment.getWellnessServer$Authentication_release();
        }
        return environment.getWellnessServer$Authentication_release();
    }

    public static final int getWellnessPlatformId(Environment environment) {
        u.j(environment, "<this>");
        if (u.e(environment, Environment.Dev.INSTANCE)) {
            return 2;
        }
        if (u.e(environment, Environment.Beta.INSTANCE) || u.e(environment, Environment.Prod.INSTANCE)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
