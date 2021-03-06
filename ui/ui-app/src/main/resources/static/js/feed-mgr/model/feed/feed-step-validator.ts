import {Feed} from "./feed.model";
import {Step} from "./feed-step.model";

export class FeedStepValidator  {

    hasFormErrors:boolean;
    constructor() {
    }


    public validate(feed:Feed, step:Step) : boolean{
        if(step.required && !step.visited) {
            step.setComplete(false);
        } else if(this.hasFormErrors){
            step.setComplete(false);
            step.valid = false;
        }
        else {
            step.valid = true;
            step.setComplete(true)
        }
        return step.valid;
    }



}