package de.x4fyr.markdown_notes;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class EditorFragment extends Fragment {

    EditorActivity editorActivity;

    public EditorFragment(){
        super();
    }


    @Override
    public void onAttach(Context context) {
        this.editorActivity = (EditorActivity) context;

        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_editor, container, false);
    }

    @Override
    public void onStart() {
        EditText editorEditText = (EditText) getView().findViewById(R.id.editor_textEdit);

        editorEditText.setText(editorActivity.getNote().content);

        EditorActivity context = (EditorActivity) getContext();
        editorEditText.addTextChangedListener(context.editorWatcher);
        editorEditText.setHorizontallyScrolling(true);

        super.onStart();
    }
}
