package mx.spin.mobile.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Entity mapped to table "POOL".
 */
public class Pool implements Parcelable {

    private Long id;
    private Integer pool_id;
    private Integer pool_user_id;
    private String pool_name;
    private String pool_customer;
    private String pool_address;
    private String pool_form;
    private String pool_category;
    private String pool_use;
    private String pool_type;
    private String pool_rotation;
    private String pool_volume;
    private String pool_um;
    private String pool_register;
    private String pool_modify;
    private String pool_delete;
    private String pool_status;
    private String analysis;
    private String pool_equipment;

    public String getmEquipos() {
        return mEquipos;
    }

    public void setmEquipos(String mEquipos) {
        this.mEquipos = mEquipos;
    }

    public String mEquipos;

    @SerializedName("equipos")
    public List<Equipment> equipos;

    public Pool() {
    }

    public Pool(Long id) {
        this.id = id;
    }

    public Pool(Long id, Integer pool_id, Integer pool_user_id, String pool_name, String pool_customer, String pool_address, String pool_form, String pool_category, String pool_use, String pool_type, String pool_rotation, String pool_volume, String pool_um, String pool_register, String pool_modify, String pool_delete, String pool_status, String analysis, String pool_equipment) {
        this.id = id;
        this.pool_id = pool_id;
        this.pool_user_id = pool_user_id;
        this.pool_name = pool_name;
        this.pool_customer = pool_customer;
        this.pool_address = pool_address;
        this.pool_form = pool_form;
        this.pool_category = pool_category;
        this.pool_use = pool_use;
        this.pool_type = pool_type;
        this.pool_rotation = pool_rotation;
        this.pool_volume = pool_volume;
        this.pool_um = pool_um;
        this.pool_register = pool_register;
        this.pool_modify = pool_modify;
        this.pool_delete = pool_delete;
        this.pool_status = pool_status;
        this.analysis = analysis;
        this.pool_equipment = pool_equipment;
    }

    protected Pool(Parcel in) {
        pool_name = in.readString();
        pool_customer = in.readString();
        pool_address = in.readString();
        pool_form = in.readString();
        pool_category = in.readString();
        pool_use = in.readString();
        pool_type = in.readString();
        pool_rotation = in.readString();
        pool_volume = in.readString();
        pool_um = in.readString();
        pool_register = in.readString();
        pool_modify = in.readString();
        pool_delete = in.readString();
        pool_status = in.readString();
        analysis = in.readString();
        pool_equipment = in.readString();
    }

    public static final Creator<Pool> CREATOR = new Creator<Pool>() {
        @Override
        public Pool createFromParcel(Parcel in) {
            return new Pool(in);
        }

        @Override
        public Pool[] newArray(int size) {
            return new Pool[size];
        }
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public Integer getPool_user_id() {
        return pool_user_id;
    }

    public void setPool_user_id(Integer pool_user_id) {
        this.pool_user_id = pool_user_id;
    }

    public String getPool_name() {
        return pool_name;
    }

    public void setPool_name(String pool_name) {
        this.pool_name = pool_name;
    }

    public String getPool_customer() {
        return pool_customer;
    }

    public void setPool_customer(String pool_customer) {
        this.pool_customer = pool_customer;
    }

    public String getPool_address() {
        return pool_address;
    }

    public void setPool_address(String pool_address) {
        this.pool_address = pool_address;
    }

    public String getPool_form() {
        return pool_form;
    }

    public void setPool_form(String pool_form) {
        this.pool_form = pool_form;
    }

    public String getPool_category() {
        return pool_category;
    }

    public void setPool_category(String pool_category) {
        this.pool_category = pool_category;
    }

    public String getPool_use() {
        return pool_use;
    }

    public void setPool_use(String pool_use) {
        this.pool_use = pool_use;
    }

    public String getPool_type() {
        return pool_type;
    }

    public void setPool_type(String pool_type) {
        this.pool_type = pool_type;
    }

    public String getPool_rotation() {
        return pool_rotation;
    }

    public void setPool_rotation(String pool_rotation) {
        this.pool_rotation = pool_rotation;
    }

    public String getPool_volume() {
        return pool_volume;
    }

    public void setPool_volume(String pool_volume) {
        this.pool_volume = pool_volume;
    }

    public String getPool_um() {
        return pool_um;
    }

    public void setPool_um(String pool_um) {
        this.pool_um = pool_um;
    }

    public String getPool_register() {
        return pool_register;
    }

    public void setPool_register(String pool_register) {
        this.pool_register = pool_register;
    }

    public String getPool_modify() {
        return pool_modify;
    }

    public void setPool_modify(String pool_modify) {
        this.pool_modify = pool_modify;
    }

    public String getPool_delete() {
        return pool_delete;
    }

    public void setPool_delete(String pool_delete) {
        this.pool_delete = pool_delete;
    }

    public String getPool_status() {
        return pool_status;
    }

    public void setPool_status(String pool_status) {
        this.pool_status = pool_status;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getPool_equipment() {
        return pool_equipment;
    }

    public void setPool_equipment(String pool_equipment) {
        this.pool_equipment = pool_equipment;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(pool_name);
        parcel.writeString(pool_customer);
        parcel.writeString(pool_address);
        parcel.writeString(pool_form);
        parcel.writeString(pool_category);
        parcel.writeString(pool_use);
        parcel.writeString(pool_type);
        parcel.writeString(pool_rotation);
        parcel.writeString(pool_volume);
        parcel.writeString(pool_um);
        parcel.writeString(pool_register);
        parcel.writeString(pool_modify);
        parcel.writeString(pool_delete);
        parcel.writeString(pool_status);
        parcel.writeString(analysis);
        parcel.writeString(pool_equipment);
    }
}
