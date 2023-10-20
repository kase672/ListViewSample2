import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import androidx.annotation.Nullable;


public class OrderConfirmDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.dialog_title);

        builder.setMessage(R.string.dialog_msg);

        builder.setPositiveButton(R.string.dialog_btn_ok,new DialogButtonClickListener());

        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());

        builder.setNeutralButton(R.string.dialog_btn_nu, new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void OnClick(DialogInterface dialog, int which) {
            String msg ="";

            switch(which) {
                case DialogInterface.BUTTON_POSITIVE:

                    msg = getString(R.string.dialog_ok_toast);
                    break;

                case DialogInterface.BUTTON_NEGATIVE:

                    msg = getString(R.string.dialog_ng_toast);
                    break;

                case DialogInterface.BUTTON_NEUTRAL:

                    msg = getString(R.string.dialog_nu_toast);
                    break;
            }

            Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
        }
    }
}
