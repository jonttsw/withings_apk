package com.withings.library.authentication.host;

import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.host.session.PreviousSessionRepository;
import kotlin.Metadata;
/* compiled from: AuthenticationDependenciesBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/host/AuthenticationDependenciesBuilder;", "", "getApplicationInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "getDeviceInformationProvider", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "getPreviousSessionRepository", "Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AuthenticationDependenciesBuilder {
    ApplicationInformationProvider getApplicationInformationProvider();

    DeviceInformationProvider getDeviceInformationProvider();

    PreviousSessionRepository getPreviousSessionRepository();
}
