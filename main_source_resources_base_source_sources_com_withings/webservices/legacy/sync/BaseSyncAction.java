package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.common.SessionIdProvider;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.sync.SyncAction;
/* loaded from: classes4.dex */
public abstract class BaseSyncAction implements SyncAction.WithSyncContext {
    private ApiBuilder apiBuilder;
    private LastUpdate lastUpdate;
    private boolean needsLastUpdate;
    private String syncContext;

    public BaseSyncAction() {
        this(Webservices.get().getApiBuilder());
    }

    public <A> A getApi(Class<A> cls, SessionIdProvider sessionIdProvider) {
        return (A) this.apiBuilder.setSessionIdProvider(sessionIdProvider).setSyncContext(this.syncContext).build(cls);
    }

    public ApiBuilder getApiBuilder() {
        return this.apiBuilder;
    }

    public <A> A getApiForAccount(Class<A> cls) {
        return (A) this.apiBuilder.setAccountSessionProvider().setSyncContext(this.syncContext).build(cls);
    }

    public LastUpdate getLastUpdate() {
        return this.lastUpdate;
    }

    public String getSyncContext() {
        return this.syncContext;
    }

    @Override // com.withings.webservices.legacy.sync.SyncAction
    public boolean needsLastUpdate() {
        return this.needsLastUpdate;
    }

    @Override // com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public abstract /* synthetic */ void run() throws Exception;

    public void run(BaseSyncAction baseSyncAction) throws Exception {
        baseSyncAction.setLastUpdate(this.lastUpdate);
        baseSyncAction.setSyncContext(this.syncContext);
        baseSyncAction.run();
    }

    public void setApiBuilder(ApiBuilder apiBuilder) {
        this.apiBuilder = apiBuilder;
    }

    @Override // com.withings.webservices.legacy.sync.SyncAction
    public void setLastUpdate(LastUpdate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setNeedsLastUpdate(boolean z5) {
        this.needsLastUpdate = z5;
    }

    @Override // com.withings.webservices.legacy.sync.SyncAction.WithSyncContext
    public void setSyncContext(String str) {
        this.syncContext = str;
    }

    public BaseSyncAction(ApiBuilder apiBuilder) {
        this.apiBuilder = apiBuilder;
    }
}
