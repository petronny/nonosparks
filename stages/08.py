import json
stage='08'
data={}
data['width']=10
data['height']=5
data['hints']={}
data['hints']['horizontal']=['1','3','1 2','1 2','1 1','2 2','5','1 1','4','1']
data['hints']['vertical']=['7','2 2 2','1 1 1','8','2 2']
data['answer']=[]
data['answer'].append([0,0,1,1,1,1,1,1,1,0])
data['answer'].append([1,1,0,0,0,1,1,0,1,1])
data['answer'].append([0,1,0,0,0,0,1,0,1,0])
data['answer'].append([0,1,1,1,1,1,1,1,1,0])
data['answer'].append([0,0,1,1,0,1,1,0,0,0])

json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
