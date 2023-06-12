package commandPattern;

public class ConcreteCommandSave implements Operation {

        private Request request;

        public ConcreteCommandSave(Request request){
            this.request = request;
        }

        public void execute() {
            request.save();
        }
}