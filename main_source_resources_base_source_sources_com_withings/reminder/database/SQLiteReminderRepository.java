package com.withings.reminder.database;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.k0;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.joda.time.DateTime;
/* compiled from: SQLiteReminderRepository.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00010B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b.\u0010/J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderRepository;", "Lcom/withings/reminder/model/ReminderRepository;", "", "id", "Lcom/withings/reminder/model/Reminder;", "getReminderById", "(J)Lcom/withings/reminder/model/Reminder;", "", "getAllReminders", "()Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "getAllRemindersLiveData", "()Landroidx/lifecycle/LiveData;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "addReminder", "(Lcom/withings/reminder/model/Reminder;)V", "updateReminder", "", StreamManagement.Enable.ELEMENT, "setReminderEnabled", "(Lcom/withings/reminder/model/Reminder;Z)V", "deleteReminder", "reminderWsId", "Lcom/withings/reminder/model/ReminderType;", "getReminderTypeByWsId", "(J)Lcom/withings/reminder/model/ReminderType;", "getAllReminderTypes", "reminderType", "addReminderType", "(Lcom/withings/reminder/model/ReminderType;)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/withings/reminder/database/SQLiteReminderTypeDAO;", "reminderTypeDao", "Lcom/withings/reminder/database/SQLiteReminderTypeDAO;", "Lcom/withings/reminder/database/SQLiteReminderDAO;", "reminderDao", "Lcom/withings/reminder/database/SQLiteReminderDAO;", "Lcom/withings/reminder/database/SQLiteReminderRepository$DefaultReminderTypesProvider;", "defaultReminderTypesProvider", "Lcom/withings/reminder/database/SQLiteReminderRepository$DefaultReminderTypesProvider;", "Landroidx/lifecycle/k0;", "Lorg/joda/time/DateTime;", "lastDatabaseUpdate", "Landroidx/lifecycle/k0;", "<init>", "(Lcom/withings/reminder/database/SQLiteReminderTypeDAO;Lcom/withings/reminder/database/SQLiteReminderDAO;Lcom/withings/reminder/database/SQLiteReminderRepository$DefaultReminderTypesProvider;)V", "DefaultReminderTypesProvider", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SQLiteReminderRepository implements ReminderRepository {
    public static final int $stable = 8;
    private final DefaultReminderTypesProvider defaultReminderTypesProvider;
    private final k0<DateTime> lastDatabaseUpdate;
    private final SQLiteReminderDAO reminderDao;
    private final SQLiteReminderTypeDAO reminderTypeDao;

    /* compiled from: SQLiteReminderRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderRepository$DefaultReminderTypesProvider;", "", "loadDefaultValues", "", "Lcom/withings/reminder/model/ReminderType;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface DefaultReminderTypesProvider {
        List<ReminderType> loadDefaultValues();
    }

    public SQLiteReminderRepository(SQLiteReminderTypeDAO reminderTypeDao, SQLiteReminderDAO reminderDao, DefaultReminderTypesProvider defaultReminderTypesProvider) {
        u.j(reminderTypeDao, "reminderTypeDao");
        u.j(reminderDao, "reminderDao");
        this.reminderTypeDao = reminderTypeDao;
        this.reminderDao = reminderDao;
        this.defaultReminderTypesProvider = defaultReminderTypesProvider;
        k0<DateTime> k0Var = new k0<>();
        k0Var.setValue(DateTime.now());
        this.lastDatabaseUpdate = k0Var;
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void addReminder(Reminder reminder) {
        u.j(reminder, "reminder");
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        reminder.setCreatedDate(now);
        DateTime now2 = DateTime.now();
        u.i(now2, "now(...)");
        reminder.setUpdatedDate(now2);
        this.reminderDao.insert(reminder);
        this.lastDatabaseUpdate.postValue(DateTime.now());
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void addReminderType(ReminderType reminderType) {
        u.j(reminderType, "reminderType");
        this.reminderTypeDao.insert(reminderType);
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void clear() {
        this.reminderTypeDao.deleteAll();
        this.reminderDao.deleteAll();
        this.lastDatabaseUpdate.postValue(DateTime.now());
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void deleteReminder(Reminder reminder) {
        u.j(reminder, "reminder");
        this.reminderDao.delete((SQLiteReminderDAO) reminder);
        this.lastDatabaseUpdate.postValue(DateTime.now());
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public List<ReminderType> getAllReminderTypes() {
        List<ReminderType> all = this.reminderTypeDao.getAll();
        List<ReminderType> list = null;
        if (!(!all.isEmpty())) {
            all = null;
        }
        if (all == null) {
            DefaultReminderTypesProvider defaultReminderTypesProvider = this.defaultReminderTypesProvider;
            if (defaultReminderTypesProvider != null) {
                list = defaultReminderTypesProvider.loadDefaultValues();
            }
            if (list != null) {
                for (ReminderType reminderType : list) {
                    addReminderType(reminderType);
                }
            }
            if (list == null) {
                return i0.f76187a;
            }
            return list;
        }
        return all;
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public List<Reminder> getAllReminders() {
        return this.reminderDao.getAll();
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public LiveData<List<Reminder>> getAllRemindersLiveData() {
        return e1.c(this.lastDatabaseUpdate, new SQLiteReminderRepository$getAllRemindersLiveData$1(this));
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public Reminder getReminderById(long j5) {
        return this.reminderDao.getById(j5);
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public ReminderType getReminderTypeByWsId(long j5) {
        return this.reminderTypeDao.getByWsId(j5);
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void setReminderEnabled(Reminder reminder, boolean z5) {
        u.j(reminder, "reminder");
        reminder.setEnabled(z5);
        if (z5) {
            reminder.setMuteDate(null);
        }
        this.reminderDao.update(reminder);
        this.lastDatabaseUpdate.postValue(DateTime.now());
    }

    @Override // com.withings.reminder.model.ReminderRepository
    public void updateReminder(Reminder reminder) {
        u.j(reminder, "reminder");
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        reminder.setUpdatedDate(now);
        this.reminderDao.update(reminder);
        this.lastDatabaseUpdate.postValue(DateTime.now());
    }
}
